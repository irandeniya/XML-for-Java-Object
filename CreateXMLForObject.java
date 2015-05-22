
import jop.Parser;
//You should add JOParser2.0.jar to your package to access this.
//Download JOParser2.0 from here https://goo.gl/4SFCpR

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ishan
 */
public class CreateXMLForObject {

    public static void main(String[] args) {
        try {
            Customer customer = new Customer();
            customer.setFirstname("ABCD");
            customer.setLastname("QWER");
            customer.setIdCustomer(100);
            String xml = Parser.getParser().createXMLForObject(customer);
            System.out.println(xml);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//output
//<object class="Customer"><param><name>idCustomer</name><object class="java.lang.Integer">100</object></param><param><name>firstname</name><object class="java.lang.String">ABCD</object></param><param><name>lastname</name><object class="java.lang.String">QWER</object></param></object>

