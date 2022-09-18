/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MDiagnosisinfo;
import Model.MPatient;

/**
 *
 * @author Asiri
 */
public class Cdiagnosisinfo {
    public static int insertReport(int patient_id, String ward_type,String medicine,String symptoms,String diagnosis)
    {
         int i = 0;
        MDiagnosisinfo diagnosisinfo=new MDiagnosisinfo();
      i =  diagnosisinfo.insertReport(patient_id, ward_type, medicine, symptoms, diagnosis);
       return i ;
    }
}
