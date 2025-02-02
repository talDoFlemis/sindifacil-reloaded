package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.mapper;

import com.fightingnerds.sindifacil.domain.model.user.JointOwner;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.jointowner.CreateJointOwnerRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.jointowner.UpdateJointOwnerRequest;
import com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.response.jointowner.JointOwnerResponse;
import org.mapstruct.Mapper;

@Mapper
public interface JointOwnerRestMapper {
	JointOwner toJointOwner(CreateJointOwnerRequest createJointOwnerRequest);
	JointOwner toJointOwner(UpdateJointOwnerRequest updateJointOwnerRequest);
	JointOwnerResponse toJointOwnerResponse(JointOwner jointOwner);
}
