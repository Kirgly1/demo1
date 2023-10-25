package com.example.demo.DTO.DTOTables;
import com.example.demo.constants.Roles;
import org.springframework.stereotype.Component;

import javax.management.relation.Role;
import java.util.*;
@Component
public class RolesDTO {
    private UUID id;

    private Role role;
    private String roleName;

    public RolesDTO(
        UUID id,
        Role role
    ){
        this.id = id;
        this.role = role;
    }

    public RolesDTO(Role role){
        this.role = role;
    }
    public RolesDTO(Roles admin){

    }

    public static UUID id(UUID id) {
        return id;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (RolesDTO) obj;
        return Objects.equals(this.id, that.id) &&
                Objects.equals(this.role, that.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, role);
    }

    @Override
    public String toString() {
        return "UserRoleDto[" +
                "id=" + id + ", " +
                "role=" + role + ']';
    }
    public RolesDTO(){}
}
