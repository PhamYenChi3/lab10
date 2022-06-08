package TriangleEdgesCheck;

import ClientException.Client;

public class TriangleEdgesCheck {
    public void checkTriangleEdges(double a, double b, double c) throws Client {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new Client("Loi: Tam giac khong hop le!");
        } else {
            System.out.println("Tam giac hop le!");
        }
    }
}
