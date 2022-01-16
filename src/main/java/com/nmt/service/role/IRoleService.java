package com.nmt.service.role;

import com.nmt.model.user.Role;
import com.nmt.service.IGeneralService;

public interface IRoleService extends IGeneralService<Role> {
    Role findByName(String name);
}
