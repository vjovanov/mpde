package ch.epfl.yinyang.api

import reflect.runtime.universe.Symbol

/**
 * Marker trait for DSLs in which all holes are used for optimizations and
 * therefore lifted. This implies that if a DSL program has at least one hole,
 * it won't be compiled at compile time.
 *
 * NOTE: DSLs that inherit this trait will not be reflectively instantiated
 * at compile time for the purpose of determining their stage of execution.
 */
trait Staged { this: BaseYinYang => }
