package ru.practicum.explorewithme.user;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UserMapper {
    public static UserDto toDto(User user) {
        return new UserDto(user.getId(), user.getName(), user.getEmail());
    }

    public static User fromDto(UserDto userDto) {
        return new User(userDto.getId(), userDto.getName(), userDto.getEmail());
    }

    public static ShortUserDto toShortDto(User user) {
        return new ShortUserDto(user.getId(), user.getName());
    }

    public static List<UserDto> toDtoList(Collection<User> users) {
        return users.stream()
                .map(UserMapper::toDto)
                .collect(Collectors.toList());
    }
}
