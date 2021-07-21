package uz.pdp.appclickupdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.appclickupdemo.entity.enums.WorkspacePermissionName;
import uz.pdp.appclickupdemo.entity.enums.WorkspaceRoleName;
import uz.pdp.appclickupdemo.entity.template.AbsUUIDEntity;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WorkspacePermission extends AbsUUIDEntity {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private WorkspaceRole workspaceRole;//O'RINBOSAR

    @Enumerated(EnumType.STRING)
    private WorkspacePermissionName permissionName; // add member, remove member
    
}
