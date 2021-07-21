package uz.pdp.appclickupdemo.service;

import uz.pdp.appclickupdemo.entity.User;
import uz.pdp.appclickupdemo.payload.ApiResponse;
import uz.pdp.appclickupdemo.payload.MemberDTO;
import uz.pdp.appclickupdemo.payload.WorkspaceDTO;

import java.util.UUID;

public interface WorkspaceService {

    ApiResponse addWorkspace(WorkspaceDTO workspaceDTO, User user);

    ApiResponse editWorkspace(WorkspaceDTO workspaceDTO);

    ApiResponse changeOwnerWorkspace(Long id, UUID ownerId);

    ApiResponse deleteWorkspace(Long id);

    ApiResponse addOrEditOrRemoveWorkspace(Long id, MemberDTO memberDTO);

    ApiResponse joinToWorkspace(Long id, User user);
}
