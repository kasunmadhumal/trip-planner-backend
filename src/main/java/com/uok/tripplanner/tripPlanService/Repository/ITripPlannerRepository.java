package com.uok.tripplanner.tripPlanService.Repository;

import com.uok.tripplanner.tripPlanService.entity.TripPlans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITripPlannerRepository extends JpaRepository<TripPlans, Long>{
}
