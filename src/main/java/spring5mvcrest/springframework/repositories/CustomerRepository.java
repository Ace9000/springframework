package spring5mvcrest.springframework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring5mvcrest.springframework.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
