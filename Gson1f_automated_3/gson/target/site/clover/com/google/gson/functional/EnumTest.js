var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":101,"id":4636,"methods":[{"el":45,"sc":3,"sl":41}],"name":"EnumTest","sl":37},{"el":67,"id":4639,"methods":[{"el":66,"sc":5,"sl":64}],"name":"EnumTest.MyEnum","sl":61},{"el":75,"id":4641,"methods":[{"el":74,"sc":5,"sl":72}],"name":"EnumTest.ClassWithEnumFields","sl":69},{"el":100,"id":4643,"methods":[{"el":86,"sc":7,"sl":84},{"el":91,"sc":7,"sl":89},{"el":96,"sc":7,"sl":94}],"name":"EnumTest.Roshambo","sl":82}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
