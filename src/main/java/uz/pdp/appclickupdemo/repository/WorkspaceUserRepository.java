package uz.pdp.appclickupdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import uz.pdp.appclickupdemo.entity.WorkspaceUser;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

public interface WorkspaceUserRepository extends JpaRepository<WorkspaceUser, UUID> {

    Optional<WorkspaceUser> findByWorkspaceIdAndUserId(Long workspace_id, UUID user_id);

    @Transactional
    @Modifying
    void deleteByWorkspaceIdAndUserId(Long workspace_id, UUID user_id);
}
