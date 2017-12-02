package com.github.solairerove.k8s.task

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface TaskRepository : JpaRepository<Task, Long>
