package org.uengine.five.repository;

import org.metaworks.multitenancy.persistence.MultitenantRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.uengine.five.entity.ServiceEndpointEntity;

/**
 * Created by uengine on 2017. 12. 21..
 */

@RepositoryRestResource(collectionResourceRel = "services", path = "service")
public interface ServiceEndpointRepository extends MultitenantRepository<ServiceEndpointEntity, String> {
}