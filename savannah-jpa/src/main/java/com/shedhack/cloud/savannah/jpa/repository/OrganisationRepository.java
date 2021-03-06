package com.shedhack.cloud.savannah.jpa.repository;

import com.shedhack.cloud.savannah.jpa.entity.OrganisationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrganisationRepository extends PagingAndSortingRepository<OrganisationEntity, String> {

}
