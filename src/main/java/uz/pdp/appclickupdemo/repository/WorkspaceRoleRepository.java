package uz.pdp.appclickupdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.appclickupdemo.entity.WorkspaceRole;

import java.util.UUID;

public interface WorkspaceRoleRepository extends JpaRepository<WorkspaceRole, UUID> {
}
