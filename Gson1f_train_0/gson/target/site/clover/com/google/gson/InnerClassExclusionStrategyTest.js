var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":67,"id":4040,"methods":[{"el":40,"sc":3,"sl":34},{"el":46,"sc":1,"sl":43},{"el":52,"sc":1,"sl":49}],"name":"InnerClassExclusionStrategyTest","sl":28},{"el":63,"id":4051,"methods":[],"name":"InnerClassExclusionStrategyTest.InnerClass","sl":62},{"el":66,"id":4051,"methods":[],"name":"InnerClassExclusionStrategyTest.StaticNestedClass","sl":65}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_214":{"methods":[{"sl":49}],"name":"testIncludeStaticNestedClassObject210","pass":true,"statements":[{"sl":50},{"sl":51}]},"test_34":{"methods":[{"sl":43}],"name":"testIncludeStaticNestedClassField209","pass":true,"statements":[{"sl":44},{"sl":45}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [34], [34], [34], [], [], [], [214], [214], [214], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
