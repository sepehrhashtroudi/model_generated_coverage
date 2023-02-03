var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":158,"id":32324,"methods":[{"el":120,"sc":1,"sl":108}],"name":"TestGenerateJsonSchema","sl":19},{"el":86,"id":32324,"methods":[{"el":40,"sc":9,"sl":37},{"el":45,"sc":9,"sl":42},{"el":50,"sc":9,"sl":47},{"el":55,"sc":9,"sl":52},{"el":60,"sc":9,"sl":57},{"el":65,"sc":9,"sl":62},{"el":70,"sc":9,"sl":67},{"el":75,"sc":9,"sl":72},{"el":80,"sc":9,"sl":77},{"el":85,"sc":9,"sl":82}],"name":"TestGenerateJsonSchema.SimpleBean","sl":28},{"el":90,"id":32344,"methods":[],"name":"TestGenerateJsonSchema.TrivialBean","sl":88},{"el":95,"id":32344,"methods":[],"name":"TestGenerateJsonSchema.BeanWithId","sl":93},{"el":137,"id":32355,"methods":[{"el":132,"sc":6,"sl":132},{"el":133,"sc":6,"sl":133},{"el":135,"sc":6,"sl":135},{"el":136,"sc":6,"sl":136}],"name":"TestGenerateJsonSchema.FilteredBean","sl":124}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_23":{"methods":[{"sl":108}],"name":"testUntypedMap211","pass":true,"statements":[{"sl":109},{"sl":110},{"sl":112},{"sl":113},{"sl":114},{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":119}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [23], [23], [23], [], [23], [23], [23], [23], [23], [23], [23], [23], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
