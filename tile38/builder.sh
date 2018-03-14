source $stdenv/setup

echo "Building Tile38!!!"

tar xvfz $src

cd tile38-*

echo == LISTING UNARCHIVED SRC ==

ls

echo == DONE ==

mkdir -p $out/bin
cp tile38-benchmark $out/bin
cp tile38-cli $out/bin
cp tile38-server $out/bin

echo == LISTING OUT ==

ls -R $out

echo == DONE ==

