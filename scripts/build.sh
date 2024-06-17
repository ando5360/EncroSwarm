// build libdaq
sudo apt install build-essential libpcap-dev libpcre3-dev libnet1-dev zlib1g-dev luajit hwloc libdnet-dev libdumbnet-dev bison flex liblzma-dev openssl libssl-dev pkg-config libhwloc-dev cmake cpputest libsqlite3-dev uuid-dev libcmocka-dev libnetfilter-queue-dev libmnl-dev autotools-dev libluajit-5.1-dev libunwind-dev libfl-dev -y
git clone https://github.com/snort3/libdaq.git
./bootstrap
./configure #--prefix=/usr/local/lib/daq_s3
sudo make install -j4

// build snort 3.0
cd ~/
git clone https://github.com/snort3/snort3.git
mkdir /opt/snort3
export my_path=/opt/snort3
cd snort3
./configure_cmake.sh
cd build
make -j $(nproc)
sudo make install
alias snort='/path/to/bin/snort --daq-dir /usr/local/lib/daq_s3/lib/daq'
