package studenttest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jit
 */
public class ArtStudent extends Student{
    public ArtStudent(int id,String name,double grade,int finall,int report,int mid){
        this.id=id;
        this.name=name;
        this.grade=mid*0.40 + report*0.10 + finall*50;
    }
}
