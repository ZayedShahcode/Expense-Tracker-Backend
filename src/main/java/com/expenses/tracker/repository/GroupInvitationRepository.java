package com.expenses.tracker.repository;

import com.expenses.tracker.entity.GroupInvitation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GroupInvitationRepository extends JpaRepository<GroupInvitation, Long> {

    Optional<GroupInvitation> findByToken(String token);
    List<GroupInvitation> findByGroupId(Long groupId);
    List<GroupInvitation> findByInvitedUser_Id(Long id);
    void deleteById(Long id);
}
