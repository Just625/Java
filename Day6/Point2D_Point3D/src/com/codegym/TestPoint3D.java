package com.codegym;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        Point3D point3D1 = new Point3D(1,1,1);
        System.out.println(point3D1);
        point3D1.setXYZ(2,2,2);
        System.out.println(point3D1);
        float[] arr = point3D1.getXYZ();
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
