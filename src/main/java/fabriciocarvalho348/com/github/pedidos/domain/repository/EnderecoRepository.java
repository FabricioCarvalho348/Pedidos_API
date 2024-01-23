package fabriciocarvalho348.com.github.pedidos.domain.repository;

import fabriciocarvalho348.com.github.pedidos.domain.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
