package bai4;

public class Employee {
    private double grossSalary;

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.calculateNetSalary(21_000_000);

    }

    public void calculateNetSalary(double grossSalary) {
        if (grossSalary < 0) {
            System.out.println("Lỗi: Lương gross không thể là số âm");
            return;
        }

        this.grossSalary = grossSalary;
        double tax = calculateTax(grossSalary);
        double taxAmount = grossSalary * tax;
        grossSalary -= taxAmount;
        
        System.out.println("Lương gộp: " + this.grossSalary + "\n Thuế phải đóng " + taxAmount + "\n Lương thực nhận " + grossSalary   );

    }
    
    public double calculateTax(double grossSalary) {
        double tax;

        if (grossSalary > 20_000_000) {
            tax = 0.2;
        } else if (grossSalary >= 10_000_000) {
            tax = 0.1;
        } else {
            tax = 0;
        }
        
        return  tax;
    }
}
