var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":98,"id":30356,"methods":[{"el":36,"sc":1,"sl":30},{"el":54,"sc":1,"sl":39},{"el":74,"sc":1,"sl":57},{"el":97,"sc":5,"sl":91}],"name":"TestRootName","sl":11},{"el":16,"id":30356,"methods":[],"name":"TestRootName.Bean","sl":14},{"el":21,"id":30356,"methods":[],"name":"TestRootName.RootBeanWithEmpty","sl":19}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_288":{"methods":[{"sl":39},{"sl":91}],"name":"testRootUsingExplicitConfig135","pass":true,"statements":[{"sl":40},{"sl":41},{"sl":42},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":52},{"sl":53},{"sl":93},{"sl":94},{"sl":95},{"sl":96}]},"test_527":{"methods":[{"sl":57}],"name":"testReconfiguringOfWrapping442","pass":true,"statements":[{"sl":58},{"sl":59},{"sl":60},{"sl":61},{"sl":62},{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":67},{"sl":70},{"sl":72},{"sl":73}]},"test_564":{"methods":[{"sl":30},{"sl":91}],"name":"testRootViaWriterAndReader3","pass":true,"statements":[{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":93},{"sl":94},{"sl":95},{"sl":96}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [564], [564], [564], [564], [564], [564], [], [], [], [288], [288], [288], [288], [288], [288], [288], [288], [288], [288], [288], [288], [288], [288], [288], [], [], [], [527], [527], [527], [527], [527], [527], [527], [527], [527], [527], [527], [], [], [527], [], [527], [527], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [288, 564], [], [288, 564], [288, 564], [288, 564], [288, 564], [], []]
