
Vagrant.configure("2") do |config|
  config.vm.box = "optiDB"
  config.vm.hostname = "projetMaster"
  config.vm.network "private_network", ip: "192.168.33.20"
  config.vm.network "forwarded_port", guest: 3000, host: 3000, host_ip: "127.0.0.1"
  config.vm.provider "virtualbox" do |vb|
      vb.name = "projetMaster"
      vb.memory = "2048"
  end
   config.vm.provision "shell", path: 'scripts/install.sh'
end
