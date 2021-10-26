package il.co.migdal.ins.elastic.query.service.api;

import il.co.migdal.ins.elastic.query.dataaccess.entity.UserPermission;

import java.util.List;
import java.util.Optional;

public interface QueryUserService {

    Optional<List<UserPermission>> findAllPermissionsByUsername(String username);
}
