package il.co.migdal.ins.elastic.query.transformer;

import il.co.migdal.ins.elastic.query.dataaccess.entity.UserPermission;
import il.co.migdal.ins.elastic.query.security.PermissionType;
import il.co.migdal.ins.elastic.query.security.TwitterQueryUser;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserPermissionsToUserDetailTransformer {

    public TwitterQueryUser getUserDetails(List<UserPermission> userPermissions) {
        return TwitterQueryUser.builder()
                .username(userPermissions.get(0).getUsername())
                .permissions(userPermissions.stream()
                        .collect(Collectors.toMap(
                                UserPermission::getDocumentId,
                                permission -> PermissionType.valueOf(permission.getPermissionType()))))
                .build();
    }
}
