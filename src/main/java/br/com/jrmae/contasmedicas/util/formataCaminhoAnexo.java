/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jrmae.contasmedicas.util;

/**
 *
 * @author gabriel
 */
public class formataCaminhoAnexo {

    public static String formataCaminhoAnexo(String caminho) {
        try {
            caminho = caminho.replace(" ", "_");
            String[] acentos = new String[]{"Ã§", "Ã‡", "Ã¡", "Ã©", "Ã­", "Ã³", "Ãº", "Ã½", "Ã ", "Ã‰", "Ã ",
                "Ã“", "Ãš", "Ã ", "Ã ", "Ã¨", "Ã¬", "Ã²", "Ã¹", "Ã€", "Ãˆ", "ÃŒ", "Ã’", "Ã™", "Ã£", "Ãµ", "Ã±", "Ã¤", "Ã«", "Ã¯", "Ã¶", "Ã¼",
                "Ã¿", "Ã„", "Ã‹", "Ã ", "Ã–", "Ãœ", "Ãƒ", "Ã•", "Ã‘", "Ã¢", "Ãª", "Ã®", "Ã´", "Ã»", "Ã‚", "ÃŠ", "ÃŽ", "Ã”", "Ã"};
            String[] semAcento = new String[]{"c", "C", "a", "e", "i", "o", "u", "y", "A", "E", "I", "O", "U",
                "Y", "a", "e", "i", "o", "u", "A", "E", "I", "O", "U", "a", "o", "n", "a", "e", "i", "o", "u", "y", "A", "E", "I", "O", "U",
                "A", "O", "N", "a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
            for (int i = 0; i < acentos.length; i++) {
                caminho = caminho.replace(acentos[i], semAcento[i]);
            }

            String[] caracteresEspeciais = new String[]{"'", "¨", "¹", "²", "³", "£", "¢", "¬", "§", "`", "^",
                "~", ";", "ª", "º", "°", "›", "Â"};
            for (int i = 0; i < caracteresEspeciais.length; i++) {
                caminho = caminho.replaceAll(caracteresEspeciais[i], "");
            }
            return caminho;
        } catch (Exception exe) {
            return "";
        }
    }
}
