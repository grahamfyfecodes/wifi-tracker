package com.fyfe.graham.wifitracker.services;

import com.fyfe.graham.wifitracker.repository.WifiConnectionRepository;
import com.fyfe.graham.wifitracker.repository.model.WifiConnection;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WifiConnectionService {

    private final WifiConnectionRepository wifiConRepo;

    public WifiConnectionService(WifiConnectionRepository wifiConRepo) {
        this.wifiConRepo = wifiConRepo;
    }

    public WifiConnection saveWifiConnection(WifiConnection wifiConnection) {
        return wifiConRepo.save(wifiConnection);
    }

    public List<WifiConnection> getAllWifiConnections() {
        return wifiConRepo.findAll();
    }
}
