package uz.pdp.appclickupdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.appclickupdemo.entity.Workspace;

import java.util.UUID;

public interface WorkspaceRepository extends JpaRepository<Workspace, Long> {

    boolean existsByOwnerIdAndName(UUID owner_id, String name);
}
