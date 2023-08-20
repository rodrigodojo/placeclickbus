package com.placeclickbus.domains;

import java.time.LocalDateTime;

public record Place(Long id, String name , String state, String slug, LocalDateTime createdAt , LocalDateTime updatedAt) {
}
