package spring5mvcrest.springframework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring5mvcrest.springframework.domain.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
