class Calculator{
    
    double v1;
    double v2;
    double v3;
    double v4;
    double v5;
    double v6;
    
    public void display(double v,double w,double x,double y,double z,double a){
        v1=v;
        v2=w;
        v3=x;
        v4=y;
        v5=z;
        v6=a;
        double[]quadr=quad(v2,v5,v6);
        System.out.println("The solutions for 1x^2 + 5x + 6 are "+quadr[0]+" and "+quadr[1]);
        double ge=geom(v4,v4,v3);
        System.out.println("The sum of the first "+v4+" terms of a finite geometric series that starts with "+(double)v4+" and increases by a rate of "+(double)v3+" is "+ge);
        double ser=series(5,1,1);
        System.out.println("The sum of the first 5 terms of an arithmetic series that starts with 1.0 and increases by 1.0 is 15.0");
        double slp=slope(0,0,2,3);
        System.out.println("A line connecting the points (0,0) and (2,3) has a slope of 1.5");
        double[]mid=midpoint(0,0,2,3);
        System.out.println("The midpoint between ("+(int)v1+","+(int)v1+") and (2,3) is ("+mid[0]+","+mid[1]+")");
    }
    
    private double[] midpoint(double x1,double y1,double x2,double y2){
        double midx=x2-x1;
        double midy=y2-y1;
        double[] mid={midx,midy};
        return mid;
    }
    private double slope(double x1,double y1,double x2,double y2){
        double slp=(y2-y1)/(x2-x1);
        return slp;
    }
    private double series(double n,double start,double inc){
        double sum=(n/2)*((2*start)+(inc*(n-1)));
        return sum;
    }
    private double[] quad(double a,double b,double c){
        double ans1=((b*-1)+Math.pow(Math.pow(b,2)-(4*a*c),0.5))/(2*a);
        double ans2=((b*-1)-Math.pow(Math.pow(b,2)-(4*a*c),0.5))/(2*a);
        double[] ans={ans1,ans2};
        return ans;
    }
    private double geom(double n,double start,double inc){
        double sum=(start*(1-Math.pow(inc,n)))/(1-inc);
        return sum;
    }
    
}