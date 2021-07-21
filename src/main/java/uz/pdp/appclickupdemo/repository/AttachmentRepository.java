package uz.pdp.appclickupdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.appclickupdemo.entity.Attachment;

import java.util.UUID;

public interface AttachmentRepository extends JpaRepository<Attachment, UUID> {
}
