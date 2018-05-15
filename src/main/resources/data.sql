INSERT INTO manufacturors (id,name_) VALUES
  (1,'amd'),
  (2,'intel'),
  (3,'nvidia');
INSERT INTO gpus(id,model,ram,clock,cuda_cores,manufacturor_id,class_) VALUES
  (1,'gtx 1050',2048,1288,880,3,8),
  (2,'gtx 1060',3072,1288,880,3,9),
  (3,'gtx 1070',7032,1683,2432,3,10);
INSERT INTO cpus(id,model,cache_,clock,cores,manufacturor_id,class_) VALUES
  (1,'i7 1050',2048,1288,880,1,9),
  (2,'i5 1060',3072,1288,880,3,9);
INSERT into games(id,name_,mgc,rgc,mcc,rcc,mr,rr) VALUES
  (1,'GTA V',8,9,9,9,1024,2048),
  (2,'civ V',8,9,9,9,1024,2048)