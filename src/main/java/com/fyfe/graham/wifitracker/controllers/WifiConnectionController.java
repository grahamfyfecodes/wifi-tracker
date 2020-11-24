package com.fyfe.graham.wifitracker.controllers;

import com.fyfe.graham.wifitracker.repository.model.WifiConnection;
import com.fyfe.graham.wifitracker.services.WifiConnectionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WifiConnectionController {

    private final WifiConnectionService wifiConService;

    public WifiConnectionController(WifiConnectionService wifiConService) {
        this.wifiConService = wifiConService;
    }

    @PostMapping(value = "saveWifiConnection", consumes = "application/json", produces = "application/json")
    public WifiConnection saveWifiConnection(@RequestBody WifiConnection wifiConnection) {
        return wifiConService.saveWifiConnection(wifiConnection);
    }

    @GetMapping(value = "getAllWifiConnections", produces = "application/json")
    public List<WifiConnection> getAllWifiConnections() {
        return wifiConService.getAllWifiConnections();
    }
}
