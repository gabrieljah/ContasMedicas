package br.com.jrmae.contasmedicas.dao;

import br.com.jrmae.contasmedicas.entities.Lote;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class HibernateDAO<T>
        implements InterfaceDAO<T>, Serializable {

    private static final long serialVersionUID = 1L;
    private Class<T> classe;
    private Session session;

    public HibernateDAO(Class<T> classe, Session session) {
        this.classe = classe;
        this.session = session;
    }

    @Override
    public void save(T entity) {
        this.session.save(entity);
    }

    @Override
    public void update(T entity) {
        this.session.update(entity);
    }

    @Override
    public void remove(T entity) {
        this.session.delete(entity);
    }

    @Override
    public void merge(T entity) {
        this.session.merge(entity);
    }

    @Override
    public T getEntity(Serializable id) {
        Object entity = this.session.get(this.classe, id);
        return (T) entity;
    }

    @Override
    public T getEntityByDetachedCriteria(DetachedCriteria criteria) {
        Object entity = criteria.getExecutableCriteria(this.session).uniqueResult();
        return (T) entity;
    }

    @Override
    public List<T> getEntities() {
        List entities = this.session.createCriteria(this.classe).list();
        return entities;
    }

    @Override
    public List<T> getListByDetachedCriteria(DetachedCriteria criteria) {
        return criteria.getExecutableCriteria(this.session).list();
    }

    @Override
    public List<T> getListByCriteriaOrderAsc(String value) {
        List lista = new ArrayList();
        Criteria crit = this.session.createCriteria(this.classe);
        crit.addOrder(Order.asc(value));
        lista = crit.list();
        System.out.println("Listado Com Sucesso!");
        return lista;
    }

    @Override
    public List<T> getListByCriteriaOrderDesc(String value) {
        List lista = new ArrayList();
        Criteria crit = this.session.createCriteria(this.classe);
        crit.addOrder(Order.desc(value));
        lista = crit.list();
        System.out.println("Listado Com Sucesso!");
        return lista;
    }

    @Override
    public List<T> getListbyCriteriaDetail(String value) {
        List lista = new ArrayList();
        Criteria criteria = this.session.createCriteria(this.classe);
        criteria.add(Restrictions.ilike("rg", value));

        criteria.uniqueResult();
        List listar = criteria.list();
        System.out.println("Consulta por RG Feita com sucesso!");
        return listar;
    }

    @Override
    public List<T> getListbyCriteriaBuscaNome(String coluna, String value) {
        Criteria criteria = this.session.createCriteria(this.classe);
        criteria.add(Restrictions.ilike(coluna, value + "%"));
        criteria.addOrder(Order.asc(coluna));
        List listar = criteria.list();
        return listar;
    }

    public List<T> getListLoteComGuia(Long lote) {
        List lista = new ArrayList();
        Criteria criteria = this.session.createCriteria(this.classe);
        criteria.createAlias("lote", "lote", 0, Restrictions.eq("lote.idLote", lote));
        lista = criteria.list();
        return lista;
    }

    @Override
    public List<T> getListbyCriteriaBetween(Date of, Date to, String rg, String empresa, Long acesso, Long visitado) {
        List lista = new ArrayList();
        Criteria criteria = this.session.createCriteria(this.classe);
        criteria.createAlias("pessoa", "pessoa", 0, Restrictions.ilike("pessoa.rg", rg, MatchMode.ANYWHERE));
        criteria.createAlias("pessoa.acesso", "acesso", 0);
        if (visitado.longValue() != 0L) {
            criteria.createAlias("visitado", "visitado", 0, Restrictions.eq("visitado.idVisitado", visitado));
        } else {
            criteria.add(Restrictions.ilike("pessoa.empresa", empresa + "%", MatchMode.ANYWHERE));
        }
        if (acesso.longValue() != 0L) {
            criteria.add(Restrictions.eq("acesso.idAcesso", acesso));
        } else {
            criteria.add(Restrictions.between("dataVisita", of, to));
        }
        criteria.addOrder(Order.desc("idMovimento"));
        lista = criteria.list();
        return lista;
    }

    @Override
    public T getUniqueResultPrestador(Object valor) {
        Criteria criteria = this.session.createCriteria(this.classe);
        return (T) criteria.add(Restrictions.eq("idPrestador", valor)).uniqueResult();
    }

    @Override
    public T getUniqueResultBeneficiario(Object valor) {
        Criteria criteria = this.session.createCriteria(this.classe);
        return (T) criteria.add(Restrictions.eq("carteirinha", valor)).uniqueResult();
    }

    @Override
    public List<T> getListbyCriteriaStatusEntrada(String value) {
        List lista = new ArrayList();
        Criteria criteria = this.session.createCriteria(this.classe);
        criteria.add(Restrictions.ilike("status", value));
        lista = criteria.list();
        System.out.println("Consulta por Status Feita com sucesso!");
        return lista;
    }

    @Override
    public List<T> getListbyCriteriaStatusSaida(String value) {
        List lista = new ArrayList();
        Criteria criteria = this.session.createCriteria(this.classe);
        criteria.add(Restrictions.ilike("status", value));
        criteria.addOrder(Order.desc("dataSaida"));
        criteria.addOrder(Order.desc("horaSaida"));

        lista = criteria.list();
        System.out.println("Consulta por Status Feita com sucesso!");
        return lista;
    }
}
