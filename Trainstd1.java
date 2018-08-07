
package trainstd1;

import java.util.*;
public class Trainstd1 {

    public static void main(String[] args) {
       Scanner sp= new Scanner(System.in);
       String day[]=new String[15];
       int passengers[ ]=new int[15];
       double time[]=new double[15];
       String  vday= " ";
       double vtime=0.00;
       System.out.println("Enter Day...");
       for(int i=0;i<15;i++){
           day[i]=sp.nextLine();
       }
      System.out.println("Enter passengers number...");
       for(int i=0;i<15;i++){
           passengers[i]=sp.nextInt();
       }
       System.out.println("Enter time...");

       for(int i=0;i<15;i++){
           time[i]=sp.nextDouble();
       }
       
       for(int i=0;i<50;i++){
       int n;
       System.out.println("ENTER  : ");
       n=sp.nextInt();
       switch(n)
           
       {
           case 1: System.out.print("DAY \t\t DEPARTURE TIME \t\t NO.OF.PASSENGERS \t");
                   for(i=0;i<15;i++){
                       System.out.println(day[i]+"\t \t"+time[i]+"\t\t"+passengers[i]);
                   }
                 break;
                  
                       
           case 2: 
                     int big=0;
                    for(i=0;i<15;i++){
                    if(passengers[i]>big){
                      big=passengers[i];
                      vday=day[i];
                      vtime=time[i];
                   }
                   }
                   System.out.println(" THE MOST POPULAR TRAIN: ");
                   System.out.println("DAY \t\t DEPARTURE TIME \t\t NO.OF.PASSENGERS ");
                   System.out.println( vday + "\t" + vtime +"\t"+ big);
                   break;
          case 3: int small=500;
                  for(i=0;i<15;i++){
                    if(passengers[i]<small){
                      small=passengers[i];
                      vday=day[i];
                      vtime=time[i];
                   }
                   }
                   System.out.println(" THE LEAST POPULAR TRAIN: ");
                   System.out.println("DAY \t\t DEPARTURE TIME \t\t NO.OF.PASSENGERS ");
                   System.out.println(vday + "\t" + vtime +"\t"+ small);
                   break;
          case 4: int p=0;
                  System.out.println("PASSENGERS BELOW 50 IN TRAINS ");
                  System.out.println("DAY \t\t DEPARTURE TIME \t\t NO.OF.PASSENGERS ");
                  for(i=0;i<15;i++){
                   if(passengers[i]<50){
                   p=passengers[i];
                   }
                  System.out.println( day[i] + "\t" + time[i] +"\t"+ passengers[i]); }
                  break;
          case 5: 
                   int pass=0;
                  for(i=0;i<15;i++){
                   if(time[i]==12.04){
                    pass+=passengers[i];
                   }
                   }
                   System.out.println("THE AVERAGE OF 12.04 TIME PASSENGERS ARE "+pass/3);
                  
                  break;
           case 6: 
                   int passen=0;
                   int passen2=0;
                   String day2;
                
                  for(i=0;i<15;i++){
                    if(day[i]=="MONDAY"){
                     if(time[i]==6.04){
                     passen=passengers[i];
                   }
                   }
                   }
                   for(i=0;i<15;i++){
                    if(day[i]=="TUESDAY"){
                     if (time[i]==6.04){
                     passen2=passengers[i];
                   }
                   }
                   }
                 if(passen>passen2){
                  System.out.println("THE MOST POPULAR TRAIN IS MONDAY 6.04 TRAIN BECOZ THE PASSENGERS ARE "+passen); 
                 }
                if(passen<passen2)
                 {  
                     System.out.println("THE MOST POPULAR TRAIN IS TUESDAY 6.04 TRAIN BECOZ THE PASSENGERS ARE "+passen2);
                 } 
                if(passen==passen2){
                    System.out.println("THE PASSENGERS ARE SAME");
                }
                   
                   break;
             case 7: 
                      int p1=0;
                     System.out.println("ENTER THE TRAIN TIME : ");
                     vtime=sp.nextDouble();
                     for(i=0;i<15;i++){
                         if(vtime==time[i]) {
                             p1=passengers[i];
                         }
                     }
                     System.out.println("THE AVERAGE NO.OF.GIVEN TIME " +vtime+" IS " + p1);
                     break;
             case 8:
                    int pa1,pa2;
                    pa1=pa2=0;
                     String vday1=" ",vday2=" ";
                     double vtime1=0.00 ,vtime2=0.00;
                     Scanner vs=new Scanner(System.in);
                     System.out.println("Enter 1st time: ");
                     vtime1=sp.nextDouble();
                     System.out.println("Enter 2nd time: ");
                     vtime2=sp.nextDouble();
                     System.out.println("Enter 1st day: ");
                     vday1=vs.nextLine();
                     System.out.println("Enter 2nd day: ");
                     vday2=vs.nextLine();
                    for(i=0;i<15;i++){
                    if(day[i]==vday1){
                     if (time[i]==vtime1){
                     pa1+=passengers[i];
                   }
                   }
                   }
                   for(i=0;i<15;i++){
                    if(day[i]==vday2){
                     if (time[i]==vtime2){
                     pa2+=passengers[i];
                   }
                   }
                   }
                 if(pa1>pa2){
                  System.out.println("THE MOST POPULAR TRAIN IS "+vday1+ " AND "+vtime1);
                 }
                if(pa2>pa1){
                
                     System.out.println("THE MOST POPULAR TRAIN IS " +vday2+ "AND" +vtime2);
                   }
                  if(pa2==pa1){
                      System.out.println("No train has more popular ");
                  } 
                 break;
                             
       case 9:
                   System.exit(0);
               
               
       default: System.out.println("Invalid");  
          
                   }
                   }
                       
       }
        
  

    }
    

