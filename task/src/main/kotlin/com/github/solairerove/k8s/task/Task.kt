package com.github.solairerove.k8s.task

import javax.persistence.*

@Entity
@Table(name = "task")
data class Task(
        @Column(name = "name") val name: String = "",
        @Column(name = "description") val description: String = "",
        @Id @GeneratedValue(strategy = GenerationType.AUTO) val id: Long = 0
)
