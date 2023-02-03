var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":73,"id":32475,"methods":[],"name":"TestInjectables","sl":7},{"el":25,"id":32475,"methods":[{"el":24,"sc":9,"sl":21}],"name":"TestInjectables.InjectedBean","sl":9},{"el":30,"id":32477,"methods":[],"name":"TestInjectables.BadBean1","sl":27},{"el":35,"id":32477,"methods":[],"name":"TestInjectables.BadBean2","sl":32},{"el":46,"id":32477,"methods":[{"el":45,"sc":9,"sl":41}],"name":"TestInjectables.CtorBean","sl":37},{"el":57,"id":32480,"methods":[{"el":56,"sc":9,"sl":52}],"name":"TestInjectables.CtorBean2","sl":48}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
