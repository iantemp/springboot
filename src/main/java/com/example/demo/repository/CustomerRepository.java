package com.example.demo.repository;

/**
 * Created by Froy on 7/13/2017.
 */
import java.util.List;
import com.example.demo.domain.dto.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customers, Long> {

    List<Customers> getCustomersByFirstName(String lastName);
}
