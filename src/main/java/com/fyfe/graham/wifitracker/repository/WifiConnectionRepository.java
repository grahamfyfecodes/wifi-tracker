package com.fyfe.graham.wifitracker.repository;

import com.fyfe.graham.wifitracker.repository.model.WifiConnection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WifiConnectionRepository extends JpaRepository<WifiConnection, Long> {

}
