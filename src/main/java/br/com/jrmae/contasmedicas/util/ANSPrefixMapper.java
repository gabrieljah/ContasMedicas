/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jrmae.contasmedicas.util;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

/**
 *
 * @author gabriel
 */
public class ANSPrefixMapper extends NamespacePrefixMapper {  
  
    public static final String PREFIXO_ANS = "ansTISS";  
      
    @Override  
    public String getPreferredPrefix(String arg0, String arg1, boolean arg2) {  
        return PREFIXO_ANS;  
    }  
      
} 
