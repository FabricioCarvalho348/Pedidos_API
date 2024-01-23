package fabriciocarvalho348.com.github.pedidos.domain.repository;

import fabriciocarvalho348.com.github.pedidos.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
