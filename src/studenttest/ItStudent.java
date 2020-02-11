/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studenttest;

/**
 *
 * @author jit
 */
public class ItStudent extends Student{
           
    public ItStudent(int id,String name,double grade,int finall,int project,int mid){
        this.id=id;
        this.name=name;
        this.grade=mid*0.30 + project*0.30 + finall*40;
    }
}
