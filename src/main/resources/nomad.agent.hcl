###TODO: Customize this file to my needs
data_dir  = "/var/lib/nomad"
bind_addr = "0.0.0.0" # the default
advertise {
  # Defaults to the first private IP address.
  http = "1.2.3.4"
  rpc  = "1.2.3.4"
  serf = "1.2.3.4:5648" # non-default ports may be specified
}
server {
  enabled          = true
  bootstrap_expect = 4
}
client {
  enabled  = true
}
plugin "raw_exec" {
  config {
    enabled = true
  }
}
consul {
  address = "1.2.3.4:8500"
}

autopilot {
    cleanup_dead_servers      = true
    last_contact_threshold    = "200ms"
    max_trailing_logs         = 250
    server_stabilization_time = "10s"
    enable_redundancy_zones   = false
    disable_upgrade_migration = false
    enable_custom_upgrades    = false
}