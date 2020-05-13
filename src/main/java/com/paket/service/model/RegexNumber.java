package com.paket.service.model;

import java.util.List;
import java.util.regex.Pattern;


public class RegexNumber {

    public String validatePhoneNumber(String phoneNo) {
        String simpatiregex = "^(\\+62|\\+0|0|62)8(12|13|21|22|23)[0-9]{5,9}$";
        String asregex = "^(\\+62|\\+0|0|62)8(52|53|23|51)[0-9]{5,9}$";
        String mentariregex= "^(\\+62|\\+0|0|62)8(15|16|58)[0-9]{5,9}$";
        String im3regex = "^(\\+62|\\+0|0|62)8(14|55|57)[0-9]{5,9}$";
        String xlregex = "^(\\+62|\\+0|0|62)8(17|18|19|59|76|77|78)[0-9]{5,9}$";
        String three = "^(\\+62|\\+0|0|62)8(95|96|97|98|99)[0-9]{5,9}$";
        String smartfren = "^(\\+62|\\+0|0|62)8(81|82|83|84|85|86|87|88|89)[0-9]{5,9}$";
        String axis = "^(\\+62|\\+0|0|62)8(38|31|32|33)[0-9]{5,9}$";


        if(Pattern.matches(simpatiregex,phoneNo)){
            return "simpati";
        }else if(Pattern.matches(asregex,phoneNo)){
            return "as";
        }else if(Pattern.matches(mentariregex,phoneNo)){
            return "mentari";
        }else if(Pattern.matches(im3regex,phoneNo)){
            return "im3";
        }else if(Pattern.matches(xlregex,phoneNo)){
            return "xl";
        }else if(Pattern.matches(three,phoneNo)){
            return "tri";
        }else if(Pattern.matches(smartfren,phoneNo)){
            return "smartfren";
        }else if(Pattern.matches(axis,phoneNo)){
            return "axis";
        }else {
            return "invalid";
        }
    }

//    public boolean statusTerdaftar(String number){
//        boolean status = false;
//        DataProviderIndosat indosat = new DataProviderIndosat();
//        DataProviderXl xl = new DataProviderXl();
//
//        List<String> listIndosat = indosat.dataConsumenIndosat();
//        List<String> listXl = xl.dataConsumenXl();
//
//        for (int i = 0; i < listIndosat.size();i++){
//            if(number.equals(listIndosat.get(i))){
//                status = true;
//            }
//        }
//        for (int i = 0; i < listXl.size();i++){
//            if(number.equals(listXl.get(i))){
//                status = true;
//            }
//        }
//
//        return status;
//    }

}
