package com.example.SubmissionForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class FormController {

    /*
       Map Database with JAva Object  (ORM = Object Relationship Mapping)
       ==============================
    1. Create a Customers class ("Java Entity CLass")
        @Entity
        public class Customers


    2. Create a table in H2 database with same schema
        Customers table
        with CID, CNAME, CEMAIL ==> Columns

    3. Create a JPA Repository for Customers table using Customers Entity class

    4. Create an interface by extending the above Customer JPA repository
      public interface CustomerRepo extends JpaRepository<Customers, Integer>

    5. Create an Autowired object for JPA Interface -> CustomerRepo
        @Autowired
        CustomerRepo;

    6. Save the Java Object contents into H2 database table via JPA Repo
        customerRepo.save(customers);

    7. Read H2 database table into Java Object JPA Repo
        customerRepo.findById(cid).orElse(null)

     */
    @Autowired
    CustomerRepo customerRepo;
    @RequestMapping("/")
    public String details(){
        return "sub_form";
    }
    @RequestMapping("/details")
    public String Details(Customers customers){
        customerRepo.save(customers);
        return "sub_form";
    }
    @RequestMapping("/getdetails")
    public String getDetails(){
        return "ViewCustomer";
    }

    @PostMapping("/getdetails")
    public ModelAndView getDetails(@RequestParam("cid") int cid, ModelMap modelMap){
        ModelAndView mv = new ModelAndView("Retrive");
        Customers customers = customerRepo.findById(cid).orElse(null);
        mv.addObject(customers);
        return mv;
    }

    // Create a CRUD operation using RestAPI
    /*
    1. Go to http://localhost:8084/
    2. Enter the required details
    3. this will be saved in H2 database
    4. Go to http://localhost:8084/h2-console/
    5. Query is
        SELECT * FROM CUSTOMERS
        and you can see the details entered the customer details
    6. To display the values in Web go to http://localhost:8084/customers
    7. To display the particular customer details go to
        http://localhost:8084/customers/{cid}
     */

    // display all the customers list by collecting the information from the database
//    @RequestMapping("/customers")
//    @ResponseBody
//    public String getCustomers(){
//        return customerRepo.findAll().toString();
//    }
//
//    // get the information of particular customers by passing their customer id
//    @RequestMapping("/customers/{cid}")
//    @ResponseBody
//    public String getCustomers1(@PathVariable("cid") int cid){
//        return customerRepo.findById(cid).toString();
//    }

    // Displaying the output in list format
    @RequestMapping("/customers")
    @ResponseBody
    public List<Customers> getCustomers(){
        return customerRepo.findAll();
    }

    // get the information of particular customers by passing their customer id
    @RequestMapping("/customers/{cid}")
    @ResponseBody
    public Optional<Customers> getCustomers2(@PathVariable("cid") int cid){
        return customerRepo.findById(cid);
    }

    @PostMapping("/customers")
    public Customers getCustomer3(@RequestBody Customers customers){
        customerRepo.save(customers);
        return customers;
    }

    @DeleteMapping("/customers/{cid}")
    public Customers getCustomers4(@PathVariable("cid") int cid){
        Customers cust =  customerRepo.getOne(cid);
        customerRepo.delete(cust);
        return cust;
    }

    @PutMapping(path = "/customers", consumes = {"application/json"})
    public Customers getCustomers4(@RequestBody Customers customers){
        customerRepo.save(customers);
        return customers;
    }


}
