package uz.pdp.appclickupdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.appclickupdemo.entity.WorkspacePermission;

import java.util.UUID;

public interface WorkspacePermissionRepository extends JpaRepository<WorkspacePermission, UUID> {
}
