var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":108,"id":35270,"methods":[{"el":72,"sc":1,"sl":66},{"el":83,"sc":1,"sl":75},{"el":98,"sc":1,"sl":86}],"name":"TestInjectables","sl":7},{"el":25,"id":35270,"methods":[{"el":24,"sc":9,"sl":21}],"name":"TestInjectables.InjectedBean","sl":9},{"el":30,"id":35272,"methods":[],"name":"TestInjectables.BadBean1","sl":27},{"el":35,"id":35272,"methods":[],"name":"TestInjectables.BadBean2","sl":32},{"el":46,"id":35272,"methods":[{"el":45,"sc":9,"sl":41}],"name":"TestInjectables.CtorBean","sl":37},{"el":57,"id":35275,"methods":[{"el":56,"sc":9,"sl":52}],"name":"TestInjectables.CtorBean2","sl":48}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_279":{"methods":[{"sl":52},{"sl":66}],"name":"testTwoInjectablesViaCreator7","pass":true,"statements":[{"sl":54},{"sl":55},{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":71}]},"test_397":{"methods":[{"sl":21},{"sl":75}],"name":"testSimple8","pass":true,"statements":[{"sl":23},{"sl":76},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":82}]},"test_7":{"methods":[{"sl":86}],"name":"testInvalidDup434","pass":true,"statements":[{"sl":87},{"sl":88},{"sl":89},{"sl":91},{"sl":93},{"sl":94},{"sl":96}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [397], [], [397], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [279], [], [279], [279], [], [], [], [], [], [], [], [], [], [], [279], [279], [279], [279], [279], [279], [], [], [], [397], [397], [397], [397], [397], [397], [397], [397], [], [], [], [7], [7], [7], [7], [], [7], [], [7], [7], [], [7], [], [], [], [], [], [], [], [], [], [], [], []]
