var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":133,"id":36203,"methods":[{"el":81,"sc":1,"sl":77},{"el":100,"sc":1,"sl":84},{"el":118,"sc":1,"sl":103}],"name":"TestParserUsingMapper","sl":12},{"el":25,"id":36203,"methods":[{"el":24,"sc":9,"sl":24}],"name":"TestParserUsingMapper.Pojo","sl":20},{"el":68,"id":36205,"methods":[{"el":47,"sc":9,"sl":42},{"el":52,"sc":9,"sl":49},{"el":67,"sc":9,"sl":54}],"name":"TestParserUsingMapper.MyEscapes","sl":36}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_339":{"methods":[{"sl":77}],"name":"testEscapingUsingMapper285","pass":true,"statements":[{"sl":78},{"sl":79},{"sl":80}]},"test_366":{"methods":[{"sl":84}],"name":"testReadingArrayAsTree288","pass":true,"statements":[{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":89},{"sl":90},{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":98}]},"test_457":{"methods":[{"sl":103}],"name":"testIncrementalPojoReading305","pass":true,"statements":[{"sl":104},{"sl":105},{"sl":106},{"sl":107},{"sl":108},{"sl":109},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":114},{"sl":115},{"sl":116},{"sl":117}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [339], [339], [339], [339], [], [], [], [366], [366], [366], [366], [366], [366], [366], [], [366], [366], [366], [366], [366], [366], [366], [], [], [], [], [457], [457], [457], [457], [457], [457], [457], [457], [457], [457], [457], [457], [457], [457], [457], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
