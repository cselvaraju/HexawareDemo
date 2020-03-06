class ComplexNumber {
    private int real;
    private int img;

    public ComplexNumber() {
        this.real = 0;
        this.img = 0;
    }

    public ComplexNumber(int real) {
        this.real = real;
        this.img = 0;
    }

    public ComplexNumber(int real, int img) {
        this.real = real;
        this.img = img;
    }    

    public ComplexNumber(ComplexNumber other) {
        this.real = other.real;
        this.img = other.img;
    }

    /**
     * @return the real
     */
    public int getReal() {
        return real;
    }

    /**
     * @return the img
     */
    public int getImg() {
        return img;
    }

    /**
     * @param real the real to set
     */
    public void setReal(int real) {
        this.real = real;
    }

    /**
     * @param img the img to set
     */
    public void setImg(int img) {
        this.img = img;
    }

    public void showComplexNo() {
        System.out.println("Complex number is :" + real + ((this.img > 0) ? " + i " : " - i ") + Math.abs(this.img));
    }

    public boolean equals(ComplexNumber other) {
        return this.real == other.real && this.img == other.img;
    }

    public String toString() {
        return real + ((this.img > 0) ? " + i " : " - i ") + Math.abs(this.img);
    }
    public ComplexNumber add (ComplexNumber other) {
        //int real = this.real + other.real;
        //int img = this.img + other.img;
        //ComplexNumber result = new ComplexNumber(real,img);
        //return result;
         return new ComplexNumber ( this.real + other.real, this.img + other.img);
    }
    public ComplexNumber subtract (ComplexNumber other) {
        //int real = this.real - other.real;
        //int img = this.img - other.img;
        //ComplexNumber result = new ComplexNumber(real,img);
        //return result;
         return add (new ComplexNumber ( -other.real, -other.img));
    }
    public ComplexNumber multiply (ComplexNumber other) {
        //int real = this.real * other.real;
        //int img = this.img * other.img;
        //ComplexNumber result = new ComplexNumber(real,img);
        //return result;
        return new ComplexNumber( ( this.real * other.real) - (this.img * other.img), (this.real * other.img) + (this.img * other.real));
    }


    private ComplexNumber reciprocal() {
        return new ComplexNumber( 
            this.real / ((this.real* this.real) + (this.img * this.img)),
        -this.img / ((this.real * this.real) +( this.img * this.img)) );
    }

    
    public ComplexNumber divide (ComplexNumber other) {
        //int real = this.real / other.real;
        //int img = this.img / other.img;
        //ComplexNumber result = new ComplexNumber(real,img);
        //return result;
        return multiply(other.reciprocal());
    }
}

class ComplexNumberDemo {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber();
        // c1.setReal(5);
        // c1.setImg(-10);
        // c1.showComplexNo();
        System.out.println(c1);
        // difference between primitive and reference type
        // Primitive
        // Reference type
        ComplexNumber c2 = new ComplexNumber(5);
        System.out.println(c2);
        // System.out.println(c1 == c2);

        ComplexNumber c3 = new ComplexNumber(8,9);
        System.out.println(c3);
        ComplexNumber c4 = c3;
        System.out.println(c4);

    }
}